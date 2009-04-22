<?php get_header(); ?>

<div id="bloque">
	<div id="noticias">

		<h2 class="center">Lo siento, p&aacute;gina no encontrada</h2>
		<p>

Espero que alguna de las opciones de abajo puedan ayudarle:

<ul>
<li>Pueds buscar en el sitio utilizando la caja de busqueda de la derecha</li>
<li>Puedes visitar la <a href="<?echo get_settings('home') ?>">p&aacute;gina principal</a></li>
<li>O puedes echar un vistazo a traves de las ultimas publicaciones listadas debajo, quizas, lo que estas buscando est&aacute; ah&iacute;.</li>
</ul>



<h3>Ultimos Post</h3>
		<ul>
		<?php
		query_posts('posts_per_page=5');
		if (have_posts()) : while (have_posts()) : the_post(); ?>
			<li><a href="<?php the_permalink() ?>" title="<?php the_title(); ?>"><?php the_title(); ?></a>
		<?php endwhile; endif; ?>
		</ul>

	</div>


<?php get_footer(); ?>