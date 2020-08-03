<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <script type="text/javascript" src="main.js"></script>
    <style>
        form{
            margin: 0px;
            padding: 50px;
            alignment: center;

        }
        p{
            width: 120px;
            height: 50px;
            text-align: center;
            color: black;
        }
        button{
            font-size: 20px;
            width: 100px;
        }


    </style>
</head>
<body>
<form>
<div>
    <p id="message">
        <input type="text" id="input_message" placeholder="Message">
    </p>

    <p>
        <input type="text" id="input_count" placeholder="Count">
    </p>

    <p>
        <input type="text" id="input_textColor" placeholder="TextColor">
    </p>

    <p>
        <input type="text" id="input_backgroundColor" placeholder="BackgroundColor">

    </p>

    <p>
        <button type="button" id="button_print" onclick="myFunction()">PRINT</button>
    </p>

    <p>
        <button type="reset" id="button_clear" onclick="myFunction()">CLEAR</button>
    </p>
</div>
<div id="context">
</div>
</form>
</body>
<script>
    function myFunction() {
        document.getElementById("context").style.color="white";
        document.getElementById("context").style.backgroundColor="green";
        //document.getElementById("context").reset();
    }


    
</script>

</html>
