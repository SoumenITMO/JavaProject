$(document).ready(function()
{
    $(".login_").click(function()
    {
        var login_ = $(".mail_txt").val();
        var login_pwd = $(".pwd_txt").val();
        logFun(login_, login_pwd);
    })

    $(".btn-logout").on("click",function()
    {
        $.ajax({
            type: "POST",
            url: "logout",
            success: function (data)
            {
                if(data == 1){ window.location.href = "/"; }
            },
        });
    })
})

function logFun(login_user, pwd_login)
{
    var username = "";
    $.ajax({
        type: "POST",
        url: "login",
        data: {"user_login": login_user, "user_pwd":pwd_login},
        success: function (data)
        {
            if(data.length > 0)
            username = data[0][0] + " " + data[0][1];
            else
            {
                alert("WRONG USERNAME OF PASSWORD");
                $('#login').modal('hide');
            }
        },
        complete: function(data_)
        { callAnotherAjax(username); }
    });
}
function callAnotherAjax(usrName)
{
    $.ajax({
        type: "POST",
        url: "setcookie",
        data: {"user": usrName},
        success: function (data_)
        {
            $(".jj").addClass("btn-logout1");
            $('#login').modal('hide');
            window.location.href = "/";

        }
    });
}
