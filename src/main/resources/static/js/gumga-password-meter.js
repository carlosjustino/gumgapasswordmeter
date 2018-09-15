function chkPass(snh) {
    $.ajax({
        type: 'POST',
        url: '/verify',
        data: JSON.stringify({snh: snh}),
        success: function (data) {
            var complexity = $('#complexity');
            $('#score').text(data.score);
            complexity.text(data.complexityString);
            complexity.removeClass();
            complexity.addClass("badge");
            if (snh.length <= 3){
                complexity.text("Muito curta");
            }
            if (parseInt(data.score) >= 80){
                complexity.addClass("badge-success");
            }else if (parseInt(data.score) >= 60){
                complexity.addClass("badge-primary");
            }else if (parseInt(data.score) >= 40){
                complexity.addClass("badge-info");
            }else if (parseInt(data.score) >= 20){
                complexity.addClass("badge-warning");
            }else {
                complexity.addClass("badge-danger");
            }
        },
        contentType: "application/json",
        dataType: 'json'
    });

}

