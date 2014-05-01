require LWP::UserAgent;
my $URL=$ARGV[0];
my $retry_count=20;
 
my $ua = LWP::UserAgent->new;
$ua->timeout(50);
$ua->ssl_opts( verify_hostname => 0 );
do { 
	my $response = $ua->get("$URL");
 
	if ($response->is_success) {
    		print $response->content ;  
		print "\n";
    		print " The server looks fine\n";  
		exit;
	}
	else {
		print "Try number $retry_count failed \n";
		sleep 10;
	}
	$retry_count--;
   }until ($retry_count == 0 ); 
    	print " Its been 2 minutes and looks like the server is not up, please login to server and check server logs \n";

