/**
 * 服务信息页JS
 * User: FreeDomXuan
 * Date: 2020/9/18
 * Time: 14:41
 */

//接口定义
const  connections_url = "http://localhost:8080/monitor/getConnectionsInfo";
const  client_history_url = "http://localhost:8080/monitor/getClientHistoryInfo";

//初始化定时器
var timeout;

/* 重新封装加载modal */
$(document).on("show.bs.modal", ".modal", function (event) {
    var dom = $(event.relatedTarget);
    var content = dom.data('target') + 'Content';
    var href = dom.data('href');
    if (!!href && $(content).length > 0) {
        $(content).load(href);
    }

    //停止计时器
    clearInterval(timeout);
});

/* modal 重载 */
$(document).on('hidden.bs.modal', ".modal", function () {
    $(this).removeData('bs.modal');

    timeout = setInterval(function () {
        get_client_lists();
    }, 5000);
});

/* 暂停\开启 刷新 */
$(document).on('click', "#refresh", function () {
    if ($(this).hasClass('btn-danger')) {
        $(this).removeClass('btn-danger').addClass('btn-info').html('开启刷新');
        clearInterval(timeout);
    } else {
        $(this).removeClass('btn-info').addClass('btn-danger').html('暂停刷新');
        //启动计时器
        get_client_lists();
        timeout = setInterval(function () {
            get_client_lists();
        }, 5000);
    }
});



//格式化字节显示格式MB，GB等
function renderSize(value){
    if(null == value || value == ''){
        return "0 Bytes";
    }
    var unitArr = new Array("Bytes","KB","MB","GB","TB","PB","EB","ZB","YB");
    var index=0, srcsize = parseFloat(value);
    index=Math.floor(Math.log(srcsize)/Math.log(1024));
    var size =srcsize/Math.pow(1024,index);
    //  保留的小数位数
    size=size.toFixed(2);
    return size+unitArr[index];
}

function get_client_lists() {
    $.ajax({
        url:connections_url,
        type:"get",
        data:{},
        dataType:"json",
        success:function (data) {

            var html = '';

            var list = data.connections;
            for (var i in list) {
                var name = list[i].name ? list[i].name : '---';
                html += '<tr id="' + list[i].cid + '">' +
                    '<td><button class="btn btn-sm btn-info badge" data-toggle="modal" data-target="#infoModal" data-href="info.html?id=' + list[i].cid + '">' + list[i].cid + '</button></td>' +
                    '<td>' + list[i].ip + ':' + list[i].port +  '</td>' +
                    '<td style="font-size: 12px;">' + name + '</td>' +
                    '<td>' + list[i].version + '</td>' +
                    '<td style="font-size: 12px;">' + list[i].last_activity + '</td>' +
                    '<td>' + list[i].in_msgs + '条 / ' + renderSize(list[i].in_bytes) +  '</td>' +
                    '<td>' + list[i].out_msgs + '条 / ' + renderSize(list[i].out_bytes) +  '</td>' +
                    '<td>' + list[i].rtt + '</td>' +
                    '</tr>';
            }

            $('#clients_list').html(html);

            $('#server_id').html(data.server_id);
            $('#now').html(data.now);
            $('#num_connections').html(data.num_connections);

            $('#clients_table').DataTable();
        },
        error:function (data) {

        }
    })
}

//启动获取信息
$(document).ready(function() {
    get_client_lists();

    //启动计时器
    timeout = setInterval(function () {
        get_client_lists();
    }, 5000);


});

