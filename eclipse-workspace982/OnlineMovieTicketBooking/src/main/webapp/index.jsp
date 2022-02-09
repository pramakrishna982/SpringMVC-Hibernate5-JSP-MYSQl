<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
/* PPPPPPPPPPPPPPPPPP */
* {
	box-sizing: border-box
}

body {
	font-family: Arial, Helvetica, sans-serif;
}

.BookShow {
	width: 100%;
	position: relative;
	background-color: DarkOrange;
	overflow: auto;
}

.BookShow a {
	float: left;
	padding: 12px;
	color: white;
	text-decoration: none;
	font-size: 17px;
	width: 25%; /* Four links of equal widths */
	text-align: center;
}

.BookShow a:hover {
	background-color: LightSteelBlue;
}

.BookShow a.active {
	background-color: #04AA6D;
}

@media screen and (max-width: 500px) {
	.BookShow a {
		float: none;
		display: blue;
		width: 100%;
		text-align: left;
	}
}
         /* RRRRRRRRRRRRRRRR */
.navbar {
	padding: 10px;
	background-color: Grey;
	text-decoration: none;
	font-size: 12px;
	width: 100%;
}

.dropbtn {
	background-color: #F37721;
	color: white;
	padding: 16px;
	font-size: 12px;
	border: none;
	cursor: pointer;
	width: 100%;
}

.dropdown {
	position: relative;
	display: inline-block;
}

.dropdown-content {
	display: none;
	position: absolute;
	background-color: white;
	min-width: 160px;
	box-shadow: 0px 8px 16px 0px rgba(0, 0, 0, 0.2);
	z-index: 1;
}

.dropdown-content a {
	color: black;
	padding: 12px 16px;
	text-decoration: none;
	display: block;
}

.dropdown-content a:hover {
	background-color: grey
}

.dropdown:hover .dropdown-content {
	display: block;
}

.dropdown:hover .dropbtn {
	background-color: none;
}
//MMMMMMMMMMMMMM
* {
	box-sizing: border-box
}

body {
	font-family: Verdana, sans-serif;
	margin: 0;
}

.mySlides {
	display: none;
}

img {
	vertical-align: center;
}

.slideshow-container {
	max-width: 800px;
	max-height: 800px;
	position: relative;
	margin-top: 25px;
	margin-bottom: -15px;
	margin-left: 100px;
	margin-right: 100px;
}

.prev, .next {
	cursor: pointer;
	position: absolute;
	top: 50%;
	width: auto;
	padding: 16px;
	margin-top: -22px;
	color: OrangeRed;
	font-weight: bold;
	font-size: 18px;
	transition: 0.6s ease;
	border-radius: 0 3px 3px 0;
	user-select: none;
}

.next {
	right: 0;
	border-radius: 3px 0 0 3px;
}

.prev:hover, .next:hover {
	background-color: LightCyan;
}

.text {
	color: #f2f2f2;
	font-size: 15px;
	padding: 8px 12px;
	position: absolute;
	bottom: 8px;
	width: 80%;
	text-align: center;
}

.numbertext {
	color: #f2f2f2;
	font-size: 12px;
	padding: 8px 12px;
	position: absolute;
	top: 0;
}

.dot {
	cursor: pointer;
	height: 12px;
	width: 15px;
	margin: 0 2px;
	background-color: #bbb;
	border-radius: 50%;
	display: inline-block;
	transition: background-color 0.6s ease;
}

.active, .dot:hover {
	background-color: #717171;
}

.fade {
	-webkit-animation-name: fade;
	-webkit-animation-duration: 1.5s;
	animation-name: fade;
	animation-duration: 1.5s;
}

@
-webkit-keyframes fade {
	from {opacity: .4
}

to {
	opacity: 1
}

}
@
keyframes fade {
	from {opacity: .4
}

to {
	opacity: 1
}

}
@media only screen and (max-width: 200px) {
	.prev, .next, .text {
		font-size: 10px
	}
}
</style>
  <!--  MMMMMMMMMMMMMMM -->
<script>
	var slideIndex = 1;
	showSlides(slideIndex);

	function plusSlides(n) {
		showSlides(slideIndex += n);
	}

	function currentSlide(n) {
		showSlides(slideIndex = n);
	}

	function showSlides(n) {
		var i;
		var slides = document.getElementsByClassName("mySlides");
		var dots = document.getElementsByClassName("dot");
		if (n > slides.length) {
			slideIndex = 1
		}
		if (n < 1) {
			slideIndex = slides.length
		}
		for (i = 0; i < slides.length; i++) {
			slides[i].style.display = "none";
		}
		for (i = 0; i < dots.length; i++) {
			dots[i].className = dots[i].className.replace(" active", "");
		}
		slides[slideIndex - 1].style.display = "block";
		dots[slideIndex - 1].className += " active";
	}
</script>
</head>
<body>
   <!-- PPPPPPPPPPPPPPPP -->
	<div class="BookShow">
		<a href="#">Just Tickets</a> 
		<a href="#" class="fas fa-map-marker-alt" > location </a> 
		<a href="#">
			<form id="form">
				<input type="text" placeholder="Search...">
				<button>Search</button>
			</form>
		</a>
		<div class="login">
			<a href="login.html"> Login </a>
		</div>
	</div>
 <!--  RRRRRRRRRRRRRR -->
	<div class="navbar">
		<div class="dropdown">
			<button class="dropbtn">Movie</button>
			<div class="dropdown-content">
				<a href="#">Pokiri</a> <a href="#">Mirchi</a> <a href="#">Julai</a>
				<a href="#">Badhsha</a> <a href="#">Krack</a>
			</div>
		</div>
		<!-- <div class="dropdown">
			<button class="dropbtn">Theatre</button>
			<div class="dropdown-content">
				<a href="#">PVR</a> <a href="#">CV</a> <a href="#">MGB</a> <a
					href="#">AMB</a> <a href="#">PHONEIX</a>
			</div>
		</div> -->
		<div class="dropdown">
			<button class="dropbtn">Show Time</button>
			<div class="dropdown-content">
				<a href="#">Morning Show</a> 
				<a href="#">Noon Show</a>
				<a href="#">First Show</a>
			    <a href="#">Second Show</a>
			</div>
		</div>
		<div class="dropdown">
		<input type ="date" class="dropbtn">
		<!-- 	<button class="dropbtn">Date</button>
			<div class="dropdown-content">
				<a href="#">Monday</a> <a href="#">Tuesday</a> <a href="#">Wednesday</a>
				<a href="#">Thursday</a> <a href="#">Friday</a> <a href="#">Saturday</a>
				<a href="#">Sunday</a>
			</div> -->
		</div>
	</div>
	
  <!-- MMMMMMMMMMMMMMMMM -->
	<div class="slideshow-container">
		<div class="mySlides fade">
			<div class="numbertext">1 / 4</div>
			<img
				src="https://www.newsbugz.com/wp-content/uploads/2020/03/RRR-Film.jpg"
				alt="RRR" width="800" height="400">
		</div>
		<div class="mySlides fade">
			<div class="numbertext">2 / 4</div>
			<img
				src="https://www.cinesettai.in/wp-content/uploads/2020/08/master-tamil-movie.jpg"
				width="800" height="400">
		</div>

		<div class="mySlides fade">
			<div class="numbertext">3 / 4</div>
			<img
				src="https://movies2all.com/wp-content/uploads/2021/05/Spider-Man-No-Way-Home-2048x1152.jpeg"
				width="800" height="400">
		</div>
		<div class="mySlides fade">
			<div class="numbertext">4 / 4</div>
			<img src="https://images5.alphacoders.com/411/411389.jpg" width="800"
				height="400">
		</div>
		<div>
			<a class="prev" onclick="plusSlides(-1)">&#10094;</a> <a class="next"
				onclick="plusSlides(1)">&#10095;</a>
		</div>

	</div>
	<br>

	<div style="text-align: center">
		<span class="dot" onclick="currentSlide(1)"> </span> <span class="dot"
			onclick="currentSlide(2)"> </span> <span class="dot"
			onclick="currentSlide(3)"> </span> <span class="dot"
			onclick="currentSlide(4)"> </span>

	</div>
  <!--  AAAAAAAAAAAAAAA -->
	<footer>
		<div class="main-content">
			<div class="left box">
				<h2>About us</h2>
				<div class="content">
					<p>We are your one stop solution for all your movie cravings.
						It was started on the year 2000 and we are still improving and
						enhancing us with the help of your feedbacks.</p>
					<div class="social">
						<a href="https://facebook.com/coding.np">
							class="fabfa-facebook-f"></span>
						</a> 
						<a href="#"><span class="fab fa-twitter"></span></a>
						<ahref="https://instagram.com/coding.np"> class="fabfa-instagram"></span> </a> <a href="https://youtube.com/c/codingnepal">
							class="fabfa-youtube"></span>
						</a>
					</div>
				</div>
			</div>
			<div class="center box">
				<h2>Address</h2>
				<div class="content">
					<div class="place">
						<span class="fas fa-map-marker-alt"> Chennai,Tamilnadu</span> 
						
					</div>
					<div class="phone">
						<span class="fas fa-phone-alt"> 6894436789</span> 
						
					</div>
					<div class="email">
						<span class="fas fa-envelope"> justtkt@gmail.com</span> 
						<span class="text"></span>
					</div>
				</div>
			</div>
			<div class="right box">
				<h2>Contact us</h2>
				<div class="content">
					<form action="#">
						<div class="email">
							<div class="text">Email *</div>
							<input type="email" required>
						</div>
						<div class="msg">
							<div class="text">Message *</div>
							<textarea rows="2" cols="25" required></textarea>
						</div>
						<div class="btn">
							<button type="submit">Send</button>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="bottom">
			<center>
				<span class="credit">Created By <a href="index.jsp">JustTickets</span> 
				<span class="far fa-copyright"></span><span> 2020 All rightsreserved.</span>
			</center>
		</div>
	</footer>

</body>
</html>