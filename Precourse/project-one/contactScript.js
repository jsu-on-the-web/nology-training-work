
/*=============================================
=            Function Definitions            =
=============================================*/
const sendMessage = function (event) {
    event.preventDefault();
    console.log("It is working.");
    const email = document.getElementById("email").value;
    const fullName = document.getElementById("fullName").value;
    const message = document.getElementById("message").value;

    const messageData = {
        email: email,
        fullName: fullName,
        message: message
    }
    console.log(messageData);

    // Actually storing the message in session storage.
    let currentMessages = [];

    if (window.sessionStorage.getItem("messages")) {

        currentMessages = JSON.parse(
            window.sessionStorage.getItem("messages")
        );
    }
    currentMessages.push(messageData);

    window.sessionStorage.setItem(
        "messages",
        JSON.stringify(currentMessages)
    );

}


/*=============================================
=            Variable Definitions            =
=============================================*/


/*=============================================
=            Script Assignments            =
=============================================*/





