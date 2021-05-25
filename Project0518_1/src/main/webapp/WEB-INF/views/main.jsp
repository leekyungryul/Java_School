<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<!-- 참조할 내용들 -->
<head>
  <meta charset="utf-8">
  <!-- 호환성설정  디폴트는 크롬-->
  <meta http-http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>main</title>
  <meta name="viewport" content="width=divice-width, initial-scale=1">
  <!-- css파일을 연결하겠다. -->
  <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/main.css'>
</head>
<!-- 실제 들어갈 내용들 -->
<body>
  <!-- 아래 a태그들을 section으로 감싸서  -->
  <section class="wrap">
    <a href="list">목록보기</a>
    <a href="insert">데이터 입력</a>
    <a href="create_table">테이블 생성</a>
</body>

</html>