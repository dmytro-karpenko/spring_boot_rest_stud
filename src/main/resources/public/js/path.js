function Data() {
    this.init = function () {
        requestData();
    }

    function requestData() {
        $.ajax({
            url: "/api/getData",
            type: 'get',
            dataType: 'json',
            success: function (array) {

                var message = "";
                $('#imageDiv').html(message);
                $.each(array, function (index, value) {
                    message += index + ": " + JSON.stringify(value) + "\n";
                    $('#imageDiv').append(message);
                });

                console.log(message)


                //todo: do something

                setTimeout(requestData, 5000);
            },
            error: function (e) {
                setTimeout(requestData, 1000);
            }
        });
    }
}
