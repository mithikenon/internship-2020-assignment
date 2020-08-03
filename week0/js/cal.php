<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
    <style>
        .container{
            background: gray;
        }
        form{
            margin: 0;
            font-size: 20px;
            color:black;
            text-align: center;
            background: gray;

        }

    </style>
</head>
<body>
<div class="container">
    <div class="page-header">
        <form>
       <div class="form-group">
        <label for="price">Original Price:</label>
        <input type="number" id="price" name="price">
    </div>
            <br>
            <div class="form-group">
                <label for="discount">Discount:</label>
               <input type="number" id="discount" name="discount">
            </div>
            <br>
    <div class="form-group">
        <button type="button" onclick="onCalcuate()">Calcuate</button>
    </div>
            <br>
    <div class="form-group">
        <label for="disAmt">Discount Amount:</label>
        <input type="number" readonly id="disAmt">
    </div>
            <br>
    <div class="form-group">
        <label for="disAmt">Sale Price:</label>
        <input type="number" readonly id="total">
    </div>
</form>
        </div>


</body>
<script type="text/javascript">

    function onCalcuate() {

        var num1=Number(document.getElementById("price").value);
        var num2=Number(document.getElementById("discount").value)/100;

        var totalValue=num1-(num1*num2);

        document.getElementById("disAmt").value=(num1*num2).toFixed(2);

        document.getElementById("total").value=totalValue.toFixed();

    }

</script>
</body>
</html>
