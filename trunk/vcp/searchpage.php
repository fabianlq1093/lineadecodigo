<?php
/*
Template Name: Search Page
*/
?>
<?php get_header(); ?>		
<div id="content">
	<div id="info">

<h2>Buscando "<?=$_GET['q'];?>"</h2>
<br />

<div id="cse-search-results"></div>
<script type="text/javascript">
  var googleSearchIframeName = "cse-search-results";
  var googleSearchFormName = "cse-search-box";
  var googleSearchFrameWidth = 800;
  var googleSearchDomain = "www.google.com";
  var googleSearchPath = "/cse";
</script>
<script type="text/javascript" src="http://www.google.com/afsonline/show_afs_search.js"></script>

	</div>
	<?php get_sidebar(); ?>		
</div>
<?php get_footer(); ?>