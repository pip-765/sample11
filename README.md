# What's this?

Sample Keycloak Spring Seurity Adapter

# Enviroments

- Keycloak 21.1.1 (Quakus ver) and Spring Security Adapter 11.0.3

# Prerequisite

- The Keyckoak server is built.

# Configurations

- Edit src\main\resources\application.properties to config the Keycloak server.
- Start the spring application and access to http://localhost/index.
- After redirecting the Keycloak server, log in the Keycloak.
- Show the access token and ID token which is received from the Keycloak server.

# Notes

- The Spring application only work on JDK 11.
