var stompClient = null;
function connect() {
    var socket = new SockJS('/api/websocket/chat');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/messages', function (data) {
        	console.log("subscription is called");
            console.log("data"+JSON.stringify(data));
        });
        console.log("sending message");
        var msgBody = JSON.stringify({'from':'barath', 'text':'demo'});
        stompClient.send('/app/chat', {}, msgBody);
    });
}

$(function () {
    connect();
});


