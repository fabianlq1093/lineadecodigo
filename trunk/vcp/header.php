<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

<head profile="http://gmpg.org/xfn/11">
	<meta http-equiv="Content-Type" content="<?php bloginfo('html_type'); ?>; charset=<?php bloginfo('charset'); ?>" />
	
	<title><?php bloginfo('name'); ?><?php wp_title(); ?></title>
	
	<meta name="generator" content="WordPress <?php bloginfo('version'); ?>" /> <!-- leave this for stats please -->
	<meta name="verify-v1" content="NSDfysDiq+6EVRipwmTVolTADlXx/za57fo/REPoYzM=" />

	<style type="text/css" media="screen">
		@import url(<?php bloginfo('stylesheet_url'); ?>);
	</style>	

	<link rel="Shortcut Icon" href="<?php bloginfo('template_directory')?>/images/favicon.ico" type="image/x-icon" />
	<link rel="alternate" type="application/rss+xml" title="RSS 2.0" href="<?php bloginfo('rss2_url'); ?>" />
	<link rel="alternate" type="text/xml" title="RSS .92" href="<?php bloginfo('rss_url'); ?>" />
	<link rel="alternate" type="application/atom+xml" title="Atom 0.3" href="<?php bloginfo('atom_url'); ?>" />
	
	<link rel="pingback" href="<?php bloginfo('pingback_url'); ?>" />
    <?php wp_get_archives('type=monthly&format=link'); ?>
	<?php //comments_popup_script(); // off by default ?>
	
	<?php wp_head(); ?>

	
</head>
<body>

<div id="wrapper">
	
<div id="header" onclick="location.href='<?php echo get_settings('home'); ?>';" style="cursor: pointer;">
	<h1><a href="<?php echo get_settings('home'); ?>"><br/><?php bloginfo('name'); ?></a></h1>
	<p class="descripcion_sitio"><?php bloginfo('description'); ?></p>
</div>

<div id="barra">
	<div id="pages">
			<ul>
				<li><a href="<?php echo get_settings('home'); ?>">Inicio</a></li>
				<?php wp_list_pages('title_li=&depth=1&exclude=198'); ?>
			</ul>		
	</div>
</div>
	
<!-- end header -->