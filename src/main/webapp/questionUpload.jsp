<%--
  Created by IntelliJ IDEA.
  User: zhangli
  Date: 2020-06-20
  Time: 15:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!--[if IE 8]> <html lang="en" class="ie8"> <![endif]-->
<!--[if !IE]><!-->
<html lang="en">
<!--<![endif]-->
<head>
    <meta charset="utf-8" />
    <title>Color Admin | Multiple File Upload</title>
    <meta content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" name="viewport" />
    <meta content="" name="description" />
    <meta content="" name="author" />

    <!-- ================== BEGIN BASE CSS STYLE ================== -->
    <link href="http://fonts.googleapis.com/css?family=Open+Sans:300,400,600,700" rel="stylesheet">
    <link href="assets/plugins/jquery-ui/themes/base/minified/jquery-ui.min.css" rel="stylesheet" />
    <link href="assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <link href="assets/plugins/font-awesome/css/font-awesome.min.css" rel="stylesheet" />
    <link href="assets/css/animate.min.css" rel="stylesheet" />
    <link href="assets/css/style.min.css" rel="stylesheet" />
    <link href="assets/css/style-responsive.min.css" rel="stylesheet" />
    <link href="assets/css/theme/default.css" rel="stylesheet" id="theme" />
    <!-- ================== END BASE CSS STYLE ================== -->

    <!-- ================== BEGIN PAGE LEVEL CSS STYLE ================== -->
    <link href="assets/plugins/jquery-file-upload/blueimp-gallery/blueimp-gallery.min.css" rel="stylesheet" />
    <link href="assets/plugins/jquery-file-upload/css/jquery.fileupload.css" rel="stylesheet" />
    <link href="assets/plugins/jquery-file-upload/css/jquery.fileupload-ui.css" rel="stylesheet" />
    <!-- ================== END PAGE LEVEL CSS STYLE ================== -->

    <!-- ================== BEGIN BASE JS ================== -->
    <script src="assets/plugins/pace/pace.min.js"></script>
    <script src="assets/plugins/jquery/jquery-1.9.1.min.js"></script>
    <!-- ================== END BASE JS ================== -->
</head>
<body>

<!-- begin #content -->
<div id="content" class="content">
    <!-- begin breadcrumb -->
    <ol class="breadcrumb pull-right">
        <li><a href="javascript:;">主页</a></li>
        <li><a href="javascript:;">上传文件</a></li>
        <li class="active">上传视频</li>
    </ol>
    <!-- end breadcrumb -->
    <!-- begin page-header -->
    <h1 class="page-header">视频信息 <small>视频的章节</small></h1>
    <!-- end page-header -->

    <!-- begin row -->
    <div class="row">
        <!-- begin col-6 -->
        <div class="col-md-6">
            <!-- begin panel -->
            <div class="panel panel-inverse" data-sortable-id="form-stuff-1">
                <div class="panel-heading">
                    <div class="panel-heading-btn">
                        <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-default" data-click="panel-expand"><i class="fa fa-expand"></i></a>
                        <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-success" data-click="panel-reload"><i class="fa fa-repeat"></i></a>
                        <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-warning" data-click="panel-collapse"><i class="fa fa-minus"></i></a>
                        <a href="javascript:;" class="btn btn-xs btn-icon btn-circle btn-danger" data-click="panel-remove"><i class="fa fa-times"></i></a>
                    </div>
                    <h4 class="panel-title">题目上传</h4>
                </div>
                <div class="panel-body">
                    <div>excel上传题目</div>
                    <form action="/fileDown" method="get">

                        <input type="submit" value="下载模板">

                    </form>
                    <form id="fileForm" action="/importShortTel" method="post" enctype="multipart/form-data" target="message">
                    <div class="modal-body">
                        <div>上传题目：暂时只支持.xls版本</div>



                            <input type="file" name="fileUser" accept="xls/xlsx" ><br>



                        <iframe id='message' name='message' style="display:none;"></iframe>

                    </div>

                    <div class="modal-footer">

                        <button type="submit" class="btn btn-primary" data-dismiss="modal"

                                id="submitFile">上传题目</button>

                        <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>

                    </div>
                    </form>
                </div>
            </div>
            <!-- end panel -->
        </div>
        <!-- begin scroll to top btn -->
        <a href="javascript:;" class="btn btn-icon btn-circle btn-success btn-scroll-to-top fade" data-click="scroll-top"><i
                class="fa fa-angle-up"></i></a>
        <!-- end scroll to top btn -->
    </div>
</div>


<!-- ================== BEGIN BASE JS ================== -->
<script src="assets/plugins/jquery/jquery-1.9.1.min.js"></script>
<!--<script src="assets/jquery-3.2.1.min.js"></script>-->
<script src="assets/plugins/jquery/jquery-migrate-1.1.0.min.js"></script>
<script src="assets/plugins/jquery-ui/ui/minified/jquery-ui.min.js"></script>
<script src="assets/plugins/bootstrap/js/bootstrap.min.js"></script>
<!--[if lt IE 9]>
<script src="assets/crossbrowserjs/html5shiv.js"></script>
<script src="assets/crossbrowserjs/respond.min.js"></script>
<script src="assets/crossbrowserjs/excanvas.min.js"></script>
<![endif]-->
<script src="assets/plugins/slimscroll/jquery.slimscroll.min.js"></script>
<script src="assets/plugins/jquery-cookie/jquery.cookie.js"></script>
<!-- ================== END BASE JS ================== -->

<!-- ================== BEGIN PAGE LEVEL JS ================== -->
<script src="assets/plugins/jquery-file-upload/js/vendor/jquery.ui.widget.js"></script>
<script src="assets/plugins/jquery-file-upload/js/vendor/tmpl.min.js"></script>
<script src="assets/plugins/jquery-file-upload/js/vendor/load-image.min.js"></script>
<script src="assets/plugins/jquery-file-upload/js/vendor/canvas-to-blob.min.js"></script>
<script src="assets/plugins/jquery-file-upload/blueimp-gallery/jquery.blueimp-gallery.min.js"></script>
<script src="assets/plugins/jquery-file-upload/js/jquery.iframe-transport.js"></script>
<script src="assets/plugins/jquery-file-upload/js/jquery.fileupload.js"></script>
<script src="assets/plugins/jquery-file-upload/js/jquery.fileupload-process.js"></script>
<script src="assets/plugins/jquery-file-upload/js/jquery.fileupload-image.js"></script>
<script src="assets/plugins/jquery-file-upload/js/jquery.fileupload-audio.js"></script>
<script src="assets/plugins/jquery-file-upload/js/jquery.fileupload-video.js"></script>
<script src="assets/plugins/jquery-file-upload/js/jquery.fileupload-validate.js"></script>
<script src="assets/plugins/jquery-file-upload/js/jquery.fileupload-ui.js"></script>

<!--[if (gte IE 8)&(lt IE 10)]>-->
<script src="assets/plugins/jquery-file-upload/js/cors/jquery.xdr-transport.js"></script>

<!--<script src="assets/js/form-multiple-upload.demo.min.js"></script>-->
<script src="assets/js/apps.min.js"></script>
<script src="assets/json2.js"></script>
<!-- ================== END PAGE LEVEL JS ================== -->



</body>
</html>

