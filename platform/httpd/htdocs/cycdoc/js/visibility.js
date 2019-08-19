
if (document.layers) {
	origWidth = innerWidth;
	origHeight = innerHeight;
	}

function reloadPage() {
	if (innerWidth != origWidth || innerHeight != origHeight) 
	location.reload();
	}

if (document.layers) onresize = reloadPage;

function setVisibility(objectId,state) {
    //if (window.jQuery) {
//	$("#" + objectId).css("display", state);
 //   } else {
	setIdProperty(objectId, "display", state);
   // }
}

function setClassVisibility(objectClass,state) {
    var objectClasses = objectClass.split(" ");
    for (var i in objectClasses) {
	$('.' + objectClasses[i]).css('display', state);
    }
}

function toggleVisibility(objectID) {
  var state = getIdProperty( objectID, "display");
  if (state == 'none')
     setIdProperty(objectID, "display", 'block');
  else if (state == 'block')
     setIdProperty( objectID, "display", 'none');
  else 
     setIdProperty( objectID, "display", 'block');
}


//@public to be called from the browser.   Requires JQuery to be in the page
function toggleClassVisibility(objectClass, makeVisible) {
    var objectClasses = objectClass.split(" ");
    for (var i in objectClasses) {
	var elts = $('.' + objectClasses[i]);
	var state = elts.css("display");
	//if makeVisible is set, it overrides the current visibility
	if (makeVisible === true) {
	    state = 'none';
	} else if (makeVisible === false) {
	    state = 'block';
	}
	var newState = "";
	if (state == 'none') {
	    if (elts.prop('tagName') == 'TR') {
		newState = 'table-row';
	    } else if (elts.prop('tagName') == 'TH' || elts.prop('tagName') == 'TD') {
		newState = 'table-cell';
	    } else {
		newState = 'block';
	    }
	} else if (state == 'block' || state == 'table-row') {
            newState = 'none';
	} else {
	    newState = 'block';
	}
	elts.css('display', newState);
    }
}

