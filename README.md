# ses-demo
Author: Brian Kinsella

This is a custom application template with: 
- Spring boot
- Github actions workflow
- Continuous integration - testing
- Docker build, 
- Auth with AWS
- Integration with Amazon ECR


To create an ses spring boot app:
1. visit https://start.spring.io/
2. Choose maven project
3. <b>Group</b>: com.solenersync
4. <b>Artifact</b>: {service-name}
5. <b>Name</b>: {service-name}
6. Choose Java17
7. Extract and save to repositories dir
8. Open in intellij
9. Copy over docker files
10. Add a controller
11. Add unit and IT tests
12. Copy over dependencies & plugins from pom
13. Copy over github workflows
14. Update ECR REPOSITORY with unique image repository name: eg: solenersync-service-name

Git:
1. Create new repository (new should be in format of {service-name})
2. Ensure it is private
3. Push local repo to git remote

To create manifests:
1. Open repo https://github.com/solenersync/infra
2. Copy over existing service dir (eg: ses-demo) and rename {newservice}
3. Update config in all manifests in new dir to new service name eg: {newservice} instead of {ses-demo}

