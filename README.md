# moodle-auth-userkey-java

Moodle Auth Login Using Web Service By Spring Boot API
                                        By using moodle-auth_userkey plugin (https://github.com/catalyst/moodle-auth_userkey)
                                        
                                        
Log in to Moodle using one time user key.
Auth plugin for organising simple one way SSO(single sign on) between moodle and your external web application. The main idea is to make a web call to moodle and provide one of the possible matching fields to find required user and generate one time login URL. A user can be redirected to this URL to be log in to Moodle without typing username and password.

Using
Install the plugin as usual. (https://github.com/catalyst/moodle-auth_userkey)
Enable and configure just installed plugin. Set required Mapping field, User key life time, IP restriction and Logout redirect URL.
Enable web service advance feature (Admin > Advanced features), more info http://docs.moodle.org/en/Web_services
Enable one of the supported protocols (Admin > Plugins > Web services > Manage protocols)
Create a token for a specific user and for the service 'User key authentication web service' (Admin > Plugins > Web services > Manage tokens)
Make sure that the "web service" user has 'auth/userkey:generatekey' capability.
Configure your external application to make a web call to get login URL.
Redirect your users to this URL to be logged in to Moodle.

API Config:

  String token = "56371d5467d7eb9b31e2dfa02c54f98f";
  String domainName = "http://localhost/moodle";
  
  Enter your token and domain Name on the LoginService.class (https://github.com/sribalajivelan-icanio/moodle-auth-userkey-java/blob/main/src/main/java/com/moodle/auth/userkey/LoginService.java)
  
  Run the Spring Boot Application 
  
  GET
  Moodle Login By Email
  http://localhost:8080/Moodle/Login/{email}
  
  
  
