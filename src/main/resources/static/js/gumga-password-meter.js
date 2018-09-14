function verify(snh) {
    $.ajax({
        type: 'POST',
        url: '/verify',
        data: JSON.stringify({snh: snh}),
        success: function (data) {
            $('#score').text(data.score);
            $('#complexity').text(data.complexity);
        },
        contentType: "application/json",
        dataType: 'json'
    });
}