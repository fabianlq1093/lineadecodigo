<?php get_header(); ?>		
<div id="content">
	<div id="info">

		<?php include (TEMPLATEPATH . '/publicidad_superior.php'); ?>

		<?php $contador=1; if (have_posts()) : while (have_posts()) : the_post(); ?>		

			<div class="post">
				<h2 id="post-<?php the_ID(); ?>">
				<?php the_category(', ') ?>
				&raquo;
				<a href="<?php the_permalink() ?>" rel="bookmark" title="Permanent Link to <?php the_title(); ?>"><?php the_title(); ?></a>
				</h2>
				
				<div class="infoentrada">
					<span class="date"><?php the_time('F j, Y \o\n\ g:i a'); ?></span>
					<span><?php comments_popup_link('No Comments', '1 Comment', '% Comments','comentarios'); ?></span>
				</div>
				
				<div class="post_content">		
					<?php the_content("Continue reading ".the_title('', '', false)."..."); ?>			
					<span class="tags">tags: <?php the_tags('', ', ', ''); ?></span>
					<?php if(($contador==1)||($contador==5)){
							include (TEMPLATEPATH . '/publicidad_post.php'); 
						}
						$contador=$contador+1;
					?>
				</div>				
			
			
				<div class="feedback">
					<?php link_pages('<p><strong>Pages:</strong> ', '</p>', 'number'); ?><?php edit_post_link('Edit', ' &#8212; ', ''); ?>
				</div>
		
				<!--
				<?php trackback_rdf(); ?>
				-->
			</div>						
		
			<?php comments_template(); // Get wp-comments.php template ?>
						
			
		<?php endwhile; else: ?>
		
		<h2 class="center">Not Found</h2>
		<p><?php _e('Sorry, no posts matched your criteria.'); ?></p>				
		<?php endif; ?>


		<div id="navegacion">
			<?php posts_nav_link(' &#8212; ', __('&laquo; Previous Page'), __('Next Page &raquo;')); ?>
		</div>
	</div>
	<?php get_sidebar(); ?>		
</div>
<?php get_footer(); ?>