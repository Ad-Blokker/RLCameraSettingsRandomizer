<%-- 
    Document   : Result
    Created on : 12-feb-2020, 22:26:25
    Author     : mblok
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RL Random Camera Settings</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h2>Rocket League random camera settings generator</h2>
        <button onClick="window.location.reload();">Generate new settings</button><br><br>
        <h3>FOV: <% out.print((int)request.getAttribute("fov")); %><br>
        Distance: <% out.print((int)request.getAttribute("distance")); %><br>
        Height: <% out.print((int)request.getAttribute("height")); %><br>
        Angle: -<% out.print((int)request.getAttribute("angle")); %><br>
        Stiffness: <% out.print((String)request.getAttribute("stiffness")); %><br>
        Swivel Speed: <% out.print((double)request.getAttribute("swivelspeed")); %><br>
        Transition Speed: <% out.print((String)request.getAttribute("transitionspeed")); %><br></h3>
    </body>
</html>
