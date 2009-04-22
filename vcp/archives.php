<?php
/*
Template Name: Archives
*/
?>
<?php get_header(); ?>		
<div id="content">
	<div id="info">

		<h2>Archivos</h2>
			<h3>Por mes:</h3>
			<ul>
				<?php wp_get_archives('type=monthly&show_post_count=1'); ?>
			</ul>
			
			<h3>Por categoria:</h3>
			<ul>
				<?php wp_list_cats('sort_column=name&optioncount=1&feed=Feed'); ?>
			</ul>
	</div>
	<?php get_sidebar(); ?>		
</div>
<?php get_footer(); ?>