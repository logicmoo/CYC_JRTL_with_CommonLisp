var mypen = null;

window.addEventListener('load', function() {
	console.log("loaded");
  const inputbox = document.getElementById('inputbox');
  inputbox.focus();
  inputbox.disabled = true;
  inputbox.addEventListener("keyup", function(ev) {
  	   if(ev.key == "Enter") {
  	   	console.log("saw return");
  	      mypen.ask("game_turn('" + encodeURI(inputbox.value) + "', ResponseText)", [])
  	   } else {
  	   	console.log(inputbox.innerHTML);
  	       // inputbox.value = inputbox.value.toUpperCase();
  	   }
  });
  mypen = new Pengine( {
  	ask: "create_game(ResponseText)",
  	destroy: false,
  	oncreate: function(){
  		console.log("pengine created")
  		
  	},
  	onsuccess: function() {
  		console.log("pengine responds\n");
  		console.log(this);
  		if(this.data.length > 0 && this.data[0]["ResponseText"] != undefined) {
  			 if (inputbox.value != "") {
  			 	$("<code>&#x25B6;" + inputbox.value + "</code>").appendTo("#codeliketext");
  			 }
  			 if (this.data[0]["ResponseText"] != "") {
  			 	$("<code>" + this.data[0]["ResponseText"] + "</code>").appendTo("#codeliketext");
  			 }
  			 inputbox.value = ""
  			 inputbox.focus();
		    inputbox.disabled = false;
		    document.getElementById( 'bottom' ).scrollIntoView();
  		}
  		if(this.more) {
  		    mypen.next();
  		}
  	}
  });
});
