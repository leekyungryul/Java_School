<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<!-- 참조할 내용들 -->
<head>
  <meta charset="utf-8">
  <!-- 호환성설정  디폴트는 크롬-->
  <meta http-http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>데이터 입력</title>
  <meta name="viewport" content="width=divice-width, initial-scale=1">
  <!-- css파일을 연결하겠다. -->
  <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/insert.css'>
</head>
<!-- 실제 들어갈 내용들 -->
<body>
  <!-- 아래 a태그들을 section으로 감싸서  -->
  <section class="wrap">
    <form action="insert_action">
      <label> 이름입력 :
        <input type="text" name="student_name" placeholder="이름" />
      </label>
      <label> 점수입력 :
        <input type="number" name="score" placeholder="점수" />
      </label>
      <input type="submit" value="입력 완료" />
    </form>
  </section>
</body>

</html>