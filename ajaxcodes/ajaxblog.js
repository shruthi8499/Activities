// Create a function to handle the AJAX request
function loadXMLDoc() {
    var xmlhttp;
    if (window.XMLHttpRequest) {
        // Code for modern browsers
        xmlhttp = new XMLHttpRequest();
    } else {
        // Code for old IE browsers
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    
    xmlhttp.onreadystatechange = function() {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            // Parse the XML response
            var xmlDoc = xmlhttp.responseXML;
            var blogDate = xmlDoc.getElementsByTagName("blogdate")[0].childNodes[0].nodeValue;
            var blogAuthor = xmlDoc.getElementsByTagName("blog_author")[0].childNodes[0].nodeValue;
            var blogDescription = xmlDoc.getElementsByTagName("blog_description")[0].childNodes[0].nodeValue;

            // Display the retrieved data in the console
            console.log("Blog Date: " + blogDate);
            console.log("Blog Author: " + blogAuthor);
            console.log("Blog Description: " + blogDescription);
        }
    };

    // Open and send the AJAX request to the XML file
    xmlhttp.open("GET", "blog.xml", true);
    xmlhttp.send();
}

// Call the loadXMLDoc function to initiate the AJAX request
loadXMLDoc();
