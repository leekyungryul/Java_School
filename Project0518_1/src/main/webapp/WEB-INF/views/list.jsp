<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
<!-- 참조할 내용들 -->
<head>
  <meta charset="utf-8">
  <!-- 호환성설정  디폴트는 크롬-->
  <meta http-http-equiv='X-UA-Compatible' content='IE=edge'>
  <title>목록</title>
  <meta name="viewport" content="width=divice-width, initial-scale=1">
  <!-- css파일을 연결하겠다. -->
  <link rel='stylesheet' type='text/css' media='screen' href='${pageContext.request.contextPath}/resources/list.css'>
</head>
<!-- 실제 들어갈 내용들 -->
<body>
  <!-- 아래 a태그들을 section으로 감싸서  -->
  <section class="wrap">
    <table>
      <thead>
        <tr>
          <th>idx</th><th>이름</th><th>점수</th><th>생성일</th>
        </tr>
      </thead>
      <tbody>
        <tr>
          <td>1</td><td>이온유</td><td>100</td><td>2020-01-01</td>
        </tr>
        <tr>
          <td>2</td><td>이경율</td><td>50</td><td>2020-01-01</td>
        </tr>
      </tbody>
    </table>
  </section>
</body>

</html>
