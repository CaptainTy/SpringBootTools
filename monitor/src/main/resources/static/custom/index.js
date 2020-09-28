/**
 * 服务信息页JS
 * User: FreeDomXuan
 * Date: 2020/9/18
 * Time: 14:41
 */

//接口定义
const  main_info_url = "http://localhost:8080/monitor/getServerBaseInfo";
const  main_history_url = "http://localhost:8080/monitor/getServerHistoryInfo";

//初始化定时器
var timeout;

//增加jquery 判断节点是否存在统一方法
(function($) {
    $.fn.exist = function(){
        if($(this).length>=1){
            return true;
        }
        return false;
    };
})(jQuery);

//获取消息服务基本信息
function get_service_info() {
    $.ajax({
        url: main_info_url,
        type:"get",
        data:{},
        dataType:"json",
        success:function (data) {
            for (var i in data) {
                var dom = '#main_info_body #' + i;

                if ($(dom).exist()) {
                    var htm = data[i];
                    if ('max_payload' == i) {
                        htm = renderSize(data[i]);
                    }
                    $(dom).html(htm);
                }
            }
        },
        error:function (data) {

        }
    })
}

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

//获取消息服务历史状态
function get_service_history() {
    $.ajax({
        url: main_history_url,
        type:"get",
        data:{},
        dataType:"json",
        success:function (data) {

            //渲染列表信息
            for (var j in data) {
                var dom = '#main_history_body #' + j;

                if ($(dom).exist()) {
                    var htm = data[j];
                    if ('in_bytes' === j || 'out_bytes' === j) {
                        htm = renderSize(data[j]);
                    }
                    if ('in_bytes_speed' === j || 'out_msgs_speed' === j) {
                        htm = renderSize(data[j]) + '/s';
                    }
                    $(dom).html(htm);
                }
            }

            //组合图标参数
            var msg_speed_data = [
                {
                    name: '接收消息速度 条/s',
                    type: 'line',
                    data: []
                },
                {
                    name: '发送消息速度 条/s',
                    type: 'line',
                    data: []
                }
            ];

            var bytes_speed_data = [
                {
                    name: '消息生产速度',
                    type: 'line',
                    data: []
                },
                {
                    name: '消息消费速度',
                    type: 'line',
                    data: []
                }
            ];

            var client_data = [
                {
                    name: '连接数量',
                    type: 'line',
                    data: []
                },
                {
                    name: '慢消息者数量',
                    type: 'line',
                    data: []
                },
                {
                    name: '订阅者数量',
                    type: 'line',
                    data: []
                }
            ];

            var time_data = [];

            for (var i in data.history) {
                var obj = data.history[i];

                time_data.push(obj.time);

                msg_speed_data[0].data.push(obj.in_msgs_speed);
                msg_speed_data[1].data.push(obj.out_msgs_speed);

                bytes_speed_data[0].data.push(obj.in_bytes_speed);
                bytes_speed_data[1].data.push(obj.out_bytes_speed);

                client_data[0].data.push(obj.connections);
                client_data[1].data.push(obj.slow_consumers);
                client_data[2].data.push(obj.subscriptions);
            }

            //绘制消息统计
            var obj_msg_speed = echarts.init(document.getElementById('drawl_msg_speed'));
            var option_msg_speed = {
                title: {
                    text: '消息数据统计'
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: ['接收消息速度 条/s', '发送消息速度 条/s']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: time_data
                },
                yAxis: {
                    type: 'value'
                },
                dataZoom: [
                    {
                        show: true,
                        type: 'inside',
                        start: 70,
                        end: 100
                    },
                    {
                        start: 0,
                        end: 100,
                        handleSize: '80%',
                        handleStyle: {
                            color: '#fff',
                            shadowBlur: 3,
                            shadowColor: 'rgba(0, 0, 0, 0.6)',
                            shadowOffsetX: 2,
                            shadowOffsetY: 2
                        }
                    }
                ],
                series: msg_speed_data
            };
            obj_msg_speed.setOption(option_msg_speed, true);

            //绘制链接统计
            var obj_client = echarts.init(document.getElementById('drawl_client'));
            var option_client = {
                title: {
                    text: '消息数据统计'
                },
                tooltip: {
                    trigger: 'axis'
                },
                legend: {
                    data: ['连接数量', '慢消息者数量', '订阅者数量']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: time_data
                },
                yAxis: {
                    type: 'value'
                },
                dataZoom: [
                    {
                        show: true,
                        type: 'inside',
                        start: 70,
                        end: 100
                    },
                    {
                        start: 0,
                        end: 100,
                        handleSize: '80%',
                        handleStyle: {
                            color: '#fff',
                            shadowBlur: 3,
                            shadowColor: 'rgba(0, 0, 0, 0.6)',
                            shadowOffsetX: 2,
                            shadowOffsetY: 2
                        }
                    }
                ],
                series: client_data
            };
            obj_client.setOption(option_client, true);

            //绘制流量统计
            var obj_bytes_speed = echarts.init(document.getElementById('drawl_bytes_speed'));
            var option_bytes_speed = {
                title: {
                    text: '消息数据统计'
                },
                tooltip: {
                    trigger: 'axis',
                    formatter: function (params) {
                        return params[0][1] + "<br>"
                            + params[0][0] + ":" + renderSize(params[0][2]) + "/s<br>"
                            + params[1][0] + ":" + renderSize(params[1][2]) + "/s"
                    }
                },
                legend: {
                    data: [ '消息生产速度', '消息消费速度']
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '10%',
                    containLabel: true
                },
                xAxis: {
                    type: 'category',
                    boundaryGap: false,
                    data: time_data
                },
                yAxis: {
                    type: 'value',
                    axisLabel: {
                        formatter: function (params) {
                            return renderSize(params);
                        }
                    },

                },
                dataZoom: [
                    {
                        show: true,
                        type: 'inside',
                        start: 70,
                        end: 100
                    },
                    {
                        start: 0,
                        end: 100,
                        handleSize: '80%',
                        handleStyle: {
                            color: '#fff',
                            shadowBlur: 3,
                            shadowColor: 'rgba(0, 0, 0, 0.6)',
                            shadowOffsetX: 2,
                            shadowOffsetY: 2
                        }
                    }
                ],
                series: bytes_speed_data
            };

            obj_bytes_speed.setOption(option_bytes_speed, true);
        },
        error:function (data) {

        }
    })
}

/* 暂停\开启 刷新 */
$(document).on('click', "#refresh", function () {
    if ($(this).hasClass('btn-danger')) {
        $(this).removeClass('btn-danger').addClass('btn-info').html('开启刷新');
        clearInterval(timeout);
    } else {
        $(this).removeClass('btn-info').addClass('btn-danger').html('暂停刷新');
        //启动计时器
        get_service_history();
        timeout = setInterval(function () {
             get_service_history();
        }, 5000);
    }
});

//启动获取信息
$(document).ready(function() {
    get_service_info();
    get_service_history();

    //启动计时器
    timeout = setInterval(function () {
        get_service_history();
    }, 5000);
});

