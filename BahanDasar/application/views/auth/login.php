<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Form Login</title>

    <!--CSS-->
    <link rel="stylesheet" type="text/css" href="assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="assets/css/util.css">
    <link rel="stylesheet" type="text/css" href="assets/css/main.css">

</head>

<body>


    <!-- Outer Row -->
    <div class="container-login100" style="background-image: url('assets/img/earth.jpg');">

        <div class="wrap-login100 p-l-55 p-r-55 p-t-65 p-b-54">

            
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">

                        <div class="col-lg">
                                <div>
                                    <h1 class="tulisan_login">LOGIN</h1>
                                </div>
                            <div class="p-5">
                                <form class="user">
                                    <div class="form-group">
                                        <input type="text" class="form_login" id="email" name="email" placeholder="Enter Email">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form_login" id="password" name="password" placeholder="Enter Password">
                                    </div>

                                </form>
                                <hr>
                                </br>
                                <div class="container-login100-form-btn">
                                    <div class="wrap-login100-form-btn">
                                        <div class="login100-form-bgbtn"></div>
                                        <button class="login100-form-btn">
                                            Login
                                        </button>
                                    </div>
                                </div>
                                </br>
                                <div class="text-center">
                                    <a class="small" href="forgot-password.html">Lupa Password</a> <span><a class="small" href="<?= base_url() ?>auth/registration">Buat Akun</a></span>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            

        </div>

    </div>

</body>

</html>