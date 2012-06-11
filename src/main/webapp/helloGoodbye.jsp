<%
  String iSay = (String)request.getAttribute("request");
  if (iSay == null)
    iSay = "";
%>
<html>
  <head>
    <meta charset="utf-8">
    <title>Hello Goodbye</title>
    <style type="text/css">
      body {
        font: 24px 'Times New Roman';
        font-style: italic;
      }
      .title span {
        font-size: 25px;
        color: #ddf;
      }
      .youSay a {
        padding-left: 15px;
        padding-right: 15px;
      }
      .iSay {
        font-size: 55px;
        padding-left: 400px;
      }
    </style>
  </head>
  <body>
    <h1 class="title">Hello Goodbye <span>by John Lennon<span></h1>

    
    <p class="youSay">you say [
      <a href="/HelloGoodbye/YouSay/yes">yes</a>
      /<a href="/HelloGoodbye/YouSay/stop">stop</a>
      /<a href="/HelloGoodbye/YouSay/goodbye">goodbye</a>
      /<a href="/HelloGoodbye/YouSay/high">high</a>
      /<a href="/HelloGoodbye/YouSay/why">why</a>]
    </p>

    <p class="iSay"><%= iSay %></p>

    <form>
  </body>
</html>
