# Key Cloak

[[Original Documentation](https://www.keycloak.org/docs/latest/getting_started/index.html)]

## Setup Container

docker pull jboss/keycloak:latest
docker run --name KeyCloak -e KEYCLOAK_USER=root -e KEYCLOAK_PASSWORD=pass -p 8888:8080 jboss/keycloak

The server will be available at:

http://localhost:8888/auth

```
user: root
password: pass
```

## Realm

Master realm:
- Created on server setup with admin credentials
- Only used to create other realms

Other realms:
- Used to create users & applications
- Applications are owned by users

### Create Realm

Master menu (top left) -> Add realm...

Example name: "overworld"

### Create Group

Manage -> Groups -> New...

Example group: "humans"

### Create User

Manage -> Users -> Add user...

*After saving set a temporary password in the credentials tab.*

Example user: "steve"

### Create Client

Clients -> Create...

```
Access type: confidential
Valid Redirect URIs: http://localhost:8080/login/oauth2/code/first-keycloak-client
```

*Get the client secret from the credentials tab.*

To enable fine-grained authorization support:
- Toggle **Authorization Enabled**
- A tab named **Authorization** will appear


## Log In

Login page for overworld user:

http://localhost:8888/auth/realms/overworld/account

Login page for admin user:

http://localhost:8888/auth/realms/master/account/

## Some Projects

- [Front-End OAuth2 Client Implementation](first-attempt/README.md)
- [Front-End KeyCloak Implementation](second-attempt/README.md)
- [REST-Service Oauth2 Implementation](third-attempt/README.md)


---
Work in progress ...