
jQuery(document).ready(function() {
	

	$.backstretch([
                   "img/backgrounds/1.jpg"
                 , "img/backgrounds/2.jpg"
                 , "img/backgrounds/3.jpg"
                 , "img/backgrounds/4.jpg"
                ], {duration: 3300, fade: 1250});
    
    $('.login-form input[type="text"], .login-form input[type="password"], .login-form textarea').on('focus', function() {
    	$(this).removeClass('input-error');
    });
    
    $('.login-form').on('submit', function(e) {
    	
    	$(this).find('input[type="text"], input[type="password"], textarea').each(function(){
    		if( $(this).val() == "" ) {
    			e.preventDefault();
    			$(this).addClass('input-error');
    		}
    		else {
    			$(this).removeClass('input-error');
    		}
    	});
    	
    });
    
    
});
