# cloudbanco-sales-rules
Reglas de BRMs para flujo vehicular

Para  importar al business central desde el github

Steps

1.- Install JBPM as described in this document

2.- Start JBPM

3.- Login into Business Central with user: wbadmin an password: wbadmin

http://server:puerto/business-central

4.- Create a new project named cloudbanco-sales-rule

groupId: com.cloudbanco.reglas

artifactId: creditRules

version: 1.0.0

5.- Go to project settings and get git repository URL.  The URL must be ssh://localhost:8001/MySpace/cloudbanco-sales-rule

6.-SSH CONFIGURATION. This step is necesary to clone our project from Business Centralcentral

6.1.- Edit  ~/.ssh/config file (Create it if not present) and paste the next text:

```
Host localhost
  VerifyHostKeyDNS no
  StrictHostKeyChecking no
  HostKeyAlgorithms +ssh-dss
  PubkeyAcceptedKeyTypes +ssh-dss
  UserKnownHostsFile /dev/null
```

7.- Clone cloudbanco-sales-rule from github 

git clone https://github.com/lasalazarr/cloudbanco-sales-rules.git

8.- Now got to cloudbanco-sales-rule folder.

9.- Add a new git remote using the next command:

`git remote add local ssh://wbadmin@localhost:8001/MySpace/cloudbanco-sales-rule`

Where: 

`wbadmin` is the user name, and is the same used to login into Business Central

`ssh://wbadmin@localhost:8001/MySpace/cloudbanco-sales-rule` is the project URL as defined in project properties in Business Central

`local` is the name of the new remote, and this name can be anything.

The goal of this step is to upload our git project's code into Business Central

10.- Upload github's code into Business Central

execute the command

`git push -f local main`

where:

`-f` means that our working copy commits will override Business central commits

`local` is the remote destination

`main` is the name of the destination branch

Please note that git push -f local master overrides repository history of the destination remote, and you do not need to use it always.

## Push your work from Business Central to Github.  Once you finish your work in Business central, the first thing to do is pull the code from JBPM

`git pull local main`

and then

`git push origin main`

## Push your work from Github to Business Central

`git pull origin main`

and then

`git push local main `

Bear in mind that Github is the truth. The team has to be well ordered. Every day must begin pulling the code from GitHub and pushing into Busines Central, and at the end of each day, pull from Business Central and push into Github. If you don't do so, we will have to merge the conflicts every time. You were warned.
