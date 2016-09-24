
$(function () {
    alert("passo 1");
    alert("passo 2");
    var graficoDespesasCandidato = grafico;
    graficoDespesasCandidato.chart.renderTo = 'container';
    graficoDespesasCandidato.title.text = "Candidatos com maiores Despesas";
    var chartDespCand = new Highcharts.Chart(graficoDespesasCandidato);

    $.get('webresources/despesascandidato/Formosa', function (response) {
        alert("passo 3");
        var resp = JSON.stringify(response);
        var data = JSON.parse(resp);
        alert("passo 4");
        alert("passo 5");
        alert(data.toString());
        chartDespCand.series[0].setData(data);
    });



});
//$(document).ready(function () {
//    alert("passo 1");
//    alert("passo 2");
//    $.get('webresources/despesascandidato/Formosa', function (response) {
//        alert("passo 3");
//        var resp = JSON.stringify(response);
//        var data = JSON.parse(resp);
//        alert("passo 4");
//        alert("passo 5");
//        alert(data.toString());
//        chartDespCand.series[0].setData(data);
//    }
//    );
//});

//$(document).ready(function () {
//    alert("I am an alert box!11111");
//    $.ajax({
//        url: 'localhost:8080/OpenBillsWeb/webresources/despesascandidato/Formosa',
//        type: 'GET'        
//    }).then(function (data) {
//        alert("I am an alert box!22222");
//        alert(data.toString());
//        alert("I am an alert box!33333");
//        console.log(data.toString());        
//        alert("I am an alert box!444444");
//    });
//});

//$(document).ready(function () {
//    jQuery.ajax({
//        url: 'localhost:8080/OpenBillsWeb/webresources/despesascandidato/Formosa',
//        type: 'GET'
//    }).then(function (data) {
//        alert(data);
//        alert(data.toString());
//    });
//});





