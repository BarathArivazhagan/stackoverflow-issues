var stompClient = null;


function sendMessage() {
	console.log("send message is called");
	if( stompClient !=null){
		console.log("stompClient is not null");
		
	}
}


function connect() {
    var socket = new SockJS('/clipboard-websocket');
    stompClient = Stomp.over(socket);
    stompClient.connect({}, function (frame) {
        
        console.log('Connected: ' + frame);
        stompClient.subscribe('/topic/data-received', function (data) {
        	console.log("subscription is called"+data);
          
        });
    });
}



function disconnect() {
    if (stompClient != null) {
        stompClient.disconnect();
    }
    setConnected(false);
    console.log("Disconnected");
}



$(function () {
    connect();   

  
});
