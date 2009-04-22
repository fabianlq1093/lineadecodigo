<?php
/*
Template Name: Portada
*/
?>

<?php get_header(); ?>

<div id="bloque">

	<div id="noticias">
		<div class="entrada">
			<h2>Ultimas entradas</h2>
			<ul>
				<?php
				query_posts('posts_per_page=5');
				if (have_posts()) : while (have_posts()) : the_post(); ?>
					<li><a href="<?php the_permalink() ?>" title="<?php _e('Permalink for :','regulus'); ?> <?php the_title(); ?>"><?php the_title(); ?></a>
				<?php endwhile; endif; ?>
			</ul>

		</div>
	</div>

<?php get_footer(); ?>
