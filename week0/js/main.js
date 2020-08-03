window.addEventListener("load",function () {
    const inputMessage = document.getElementById('input_message');
    const inputCount = document.getElementById('input_count');
    const buttonPrint = document.getElementById('button_print');
    const outputContext = document.getElementById('context');
    const buttonClear = document.getElementById('button_clear');

    buttonPrint.addEventListener("click",function () {
        createElements(inputCount.value, inputMessage.value,outputContext);


    buttonClear.removeEventListener("click",function () {
        removeElements(outputContext);

    });




    });


});
function createElements(count,message,outputContext) {
    var i;
    for (i = 0; i < count; i++) {
        const pTag = document.createElement("p");
        const text = document.createTextNode(message);
        pTag.appendChild(text);
        outputContext.appendChild(pTag);
    }
}
function removeElements(outputContext) {
    document.getElementById("context");

}

