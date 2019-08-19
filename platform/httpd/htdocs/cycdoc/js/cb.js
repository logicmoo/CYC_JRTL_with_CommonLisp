var Dom = YAHOO.util.Dom,
    Event = YAHOO.util.Event;

var onNatMouseOver = function (event, matchedEl, container) {
  var eltClass = matchedEl.className;
  var ids = eltClass.match("naut[0-9]+-[0-9]+");
  var id = ids[0];
  var elt = document.getElementById(id);
  Dom.addClass(elt, "term-highlight");
}

var onNatMouseOut = function (event, matchedEl, container) {
  var eltClass = matchedEl.className;
  var ids = eltClass.match("naut[0-9]+-[0-9]+");
  var id = ids[0];
  Dom.removeClass(document.getElementById(id), "term-highlight");
}

Event.delegate(document, "mouseover", onNatMouseOver, "a.nat");
Event.delegate(document, "mouseout", onNatMouseOut, "a.nat");


  function getAncestorFrameByName(elt, frameName) {
    if (elt.frameElement && elt.frameElement.name == frameName) {
      return elt;
    } else if (elt.parent && elt.parent != elt) {
      return getAncestorFrameByName(elt.parent, frameName);
    } else return null;
  }


  function getAncestorIframeByName(elt, frameName) {
      var ancestor = Dom.getAncestorByTagName(elt, "iframe");
      if (ancestor == null) {
	  return null;
      }
      if (ancestor.name == frameName) {
	  return ancestor;
      } else {
	  return getAncestorIframeByName(ancestor, frameName);
      }
  }


/* Monkeying around with the HTML of an existing page */

var assertionAddedEvent = new YAHOO.util.CustomEvent("assertionAdded"); //arg-signature: (istSentenceString, eltId), where eltId is the id for the element where this came from(i.e. near where it should be added back in)
var assertionRemovedEvent = new YAHOO.util.CustomEvent("assertionRemoved");//arg-signature (istSentenceString, eltId)



assertionRemovedEvent.subscribe(handleRemoveAssertionFromPage);
assertionAddedEvent.subscribe(handleAddAssertionToPage);

function handleRemoveAssertionFromPage(sType, aArgs, oObj) {
  var triggerElt = aArgs[0];
  var sourceElt = aArgs[1];
  var oldAssertionId = aArgs[2];
  YAHOO.util.Dom.setStyle(getSubsumingAssertionElt(triggerElt), "text-decoration", "line-through");
  possiblyActivateFrameReloadButton();
}

function handleAddAssertionToPage(sType, aArgs, oObj) {
  var triggerElt=aArgs[0];
  var sourceElt=aArgs[1];
  var newSentence =aArgs[2];
  var i = 0;
  var assertionElt = getSubsumingAssertionElt(triggerElt);
  if (newSentence && assertionElt) {
    var callbackFn = function(o) {
      var newElt = document.createElement("span");
      newElt.innerHTML = "<br>" + o.responseText;
      assertionElt.parentNode.insertBefore(newElt, assertionElt.nextSibling);
      var newId = YAHOO.util.Dom.generateId(YAHOO.util.Dom.getElementsByClassName("assert", null, newElt)[0]);
      possiblyActivateFrameReloadButton();
    }
    var url = "cg?cb-form-smart&cycl=" + encodeURIComponent(newSentence); //@TODO retrigger context menus for new items
    var callback = {success: callbackFn,
                    failure: handleFailedBgLoad
    };
    YAHOO.util.Connect.asyncRequest("get", url, callback);
  }
}

function handleFailedBgLoad(o) {
  alert("Unable to perform menu action");
}

function getSubsumingAssertionElt(elt) {
  var assertionElt = YAHOO.util.Dom.getAncestorByClassName(elt, "assertion");
  if (assertionElt == null) {
    assertionElt = YAHOO.util.Dom.getAncestorByClassName(elt, "assert-sent");
  }
  return assertionElt;
}

function possiblyActivateFrameReloadButton () {
  var button = document.getElementById("reloadFrameButton");
  if (button) {
    button.setAttribute("class", "visible");
  }
}

function reloadCurrentFrame(eltId) {
  var frame= getAncestorFrame(window);
  if (frame) {
    frame.location.reload();
  }
}

  function getAncestorFrame(elt) {
    if (elt.frameElement) {
      return elt;
    } else if (elt.parentNode && elt.parentNode != elt) {
      return getAncestorFrame(elt.parentNode);
    } else return null;
  }


/* Proof-views */

function toggleCycLVisible (checkbox, eltId) {
  toggleEltClass(checkbox, eltId, "showcycl");
}
function toggleDebug (checkbox, eltId) {
  toggleEltClass(checkbox, eltId, "pf-debug");
}

function toggleEltClass (checkbox, eltId, newClass) {
  if (checkbox.checked) {
   Dom.addClass(eltId, newClass);
  } else {
    Dom.removeClass(eltId, newClass);
  }
}

function initProofView () {
  if (document.getElementById("justifications")) {
    var justificationTabView = new YAHOO.widget.TabView(document.getElementById("justifications"));
  }
    if (document.getElementById("pf-buttonbar")) {
      var pfButtonBar = new YAHOO.widget.Overlay("pf-buttonbar", {x: 1500, constraintoviewport: true, visible:true, width:"300px"} );
	if (Dom.hasClass("body", "pf-debug")) {
	    check("pf-show-debugging-checkbox");
	} else {
	    uncheck("pf-show-debugging-checkbox");
	}
	uncheck("pf-show-cycl-checkbox");
    pfButtonBar.render();
    pfButtonBar.show();
  }
}

function check(checkboxName) {
  if (document.getElementById(checkboxName) != null) {
    document.getElementById(checkboxName).checked = true;
  }
}

function uncheck(checkboxName) {
  if (document.getElementById(checkboxName) != null) {
    document.getElementById(checkboxName).checked = false;
  }
}

Event.onDOMReady(initProofView);


function setBookmark(e) {
  var target = e.target;
  var bookmarkButton = Dom.getAncestorByClassName(target, "bookmarkButton");
  var termIdRegex = /term(.*?) bookmarkB/
  var clazz= bookmarkButton.getAttribute("class");
  var rResult = termIdRegex.exec(clazz);
  var termId = rResult[1];
  var action = Dom.hasClass(bookmarkButton, "bookmarked") ? "remove" : "add";
  var callback = {
    success: handleSetBookmark,
    failure: handleFailedSetBookmark,
    argument: {elt: bookmarkButton}
  };
  var host = window.location.protocol + "//" + window.location.host;
  var requestURL = host + "/cgi-bin/ws/xml-set-bookmark?term=" + termId + "&action=" + action;
  Dom.addClass(bookmarkButton, "working");
  var request = YAHOO.util.Connect.asyncRequest("get", requestURL, callback);
}

function handleFailedSetBookmark (o) {
  alert("Error while setting/forgetting bookmark.");
    Dom.removeClass(o.argument.elt, "working");
  }

function handleSetBookmark(o) {
    var button = o.argument.elt;
    var newClass = o.responseXML.getElementsByTagName("result")[0].getAttribute("newClass");
    var newTitle = o.responseXML.getElementsByTagName("result")[0].getAttribute("title");
    Dom.removeClass(o.argument.elt, "working");
    if (newClass != "bookmarked") {
      Dom.removeClass(button, "bookmarked");
    }
    Dom.addClass(button, newClass);
    o.argument.elt.setAttribute("title", newTitle);
  }

function initBookmarks() {
    var elts = [];
    var elts = YAHOO.util.Dom.getElementsByClassName("bookmarkButton");
    YAHOO.util.Event.addListener(elts, "click", setBookmark);
}

Event.onDOMReady(initBookmarks);

//@public--this function is expected to be used from w/in html pages served up by cyc.
function backgroundLoadUrl(url, successMessage, failureMessage) {
    var callback = {
	success: function() {
	    if (successMessage) alert(successMessage);
	},
	failure: function() {
            if (failureMessage)  alert(failureMessage);
	}
    };
    YAHOO.util.Connect.asyncRequest("get", url, callback);
}

//@public--this function is expected to be used from w/in html pages served up by cyc.
/**
 * Load url, while simultaneously displaying a modal dialog with waitMessage.  When complete, displays the response
 * in another dialog. If there is an error, failureMessage will be displayed instead.
 */
function modalBackgroundLoadUrl(url, waitMessage, failureMessage) {
    var waitDivString = "\"<div title='Working'>" + waitMessage + "</div>\"";
    var dialog = $(waitDivString).dialog({modal:true});
    dialog.dialog("open");
    $.ajax({
	url: url,
	dataType: "html",
	error: function (response) {
	    dialog.dialog("close");
	    if (failureMessage) { 
		alert(failureMessage); 
	    } else {
		alert("Error while switching user.");
	    }
	},
	success: function(response) {
	    dialog.dialog("close");
	    $("<div title='Complete'>" + response + "</div>").dialog({buttons:[ { text: "Ok", click: function() { $( this ).dialog( "close" ); } }]});
	}
    });
}




/* KEA integration */

function isKeaHosted() {
	var DEFAULT_PORT_STR = "80";
	var portStr = (window.location.port.length > 0) ? window.location.port : DEFAULT_PORT_STR;
	var offset = parseInt(portStr.substring(portStr.length - 1));
	if (offset == 3) // There is a slightly brittle assumption here about the KEA always being on offset 3. - nwinant
		return true;
	else
		return false;
}

function isKeaPath(path) {
	return (path) && (path.substring(0, 3) === "/a/");
}

function getKeaSessionId(path) {
	if (!path) {
		path = window.location.pathname;
	}
	if (isKeaHosted() && isKeaPath(path)) {
		var tokens = path.split("/");
		if ((tokens[1] === "a") && (tokens.length >= 4))
			return tokens[2];
		else
			return;
	} else {
		return;
	}
}

function keaizePath(path, sessionId) {
	if (!isKeaPath(path)) {
		var prefix = (sessionId) ? "/a/" + sessionId : "/a";
		if (path.substring(0,12) === "/cgi-bin/cg?")
			return prefix + "/" + path.substring(12);
		else
			return prefix + path;
	} else {
		return path;
	}
}

function keaizePathIfNecessary(path) {
	if (isKeaHosted()) {
		return keaizePath(path, getKeaSessionId());
	} else {
		return path;
	}
}


function positionedPopup(url,winName,w,h,t,l,scroll){
  settings = 'height='+h+',width='+w+',top='+t+',left='+l+',scrollbars='+scroll+',resizable=yes,location=no';
  window.open(url,winName,settings)
}

/** a numeric timestamp with seconds granularity */
function numericTimestamp() {
  var date = new Date().toISOString();
  date = date.substring(0,19).replace("T","").replace(/-/g,"").replace(/:/g,"");
  return date;
}

function sxhashExternalStringStandalone(string) {
    var state_vector = 
	[ 7,  8,  9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 
	 23, 24, 25, 26, 27, 28, 29, 30, 31,  0,  1,  2,  3,  4,  5,  6];
    var bit_limit    = 27;
    var state = 4;
    var hash  = 131;
    for (var i = 0; i < string.length; i++) {
        state = state_vector[state];
        var charCode  = string.charCodeAt(i);
        var subhash   = charCode & 223;
        var high_bits = state;
        var result    = null;
        if (high_bits >= bit_limit) {
            result = subhash;
	} else {
            var rest_bits    = bit_limit - high_bits;
            var high_subhash = subhash >> rest_bits;
            var low_mask     =  ~(-1  << rest_bits);
            var low_subhash  = subhash & low_mask;
            var low_rotated  = low_subhash << high_bits;
            result = high_subhash | low_rotated;
        }
        hash = result ^ hash;
    }
    return hash;
  }


