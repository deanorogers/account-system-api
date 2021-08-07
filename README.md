# Getting Started Kubernetes

## Introduction

Install Docker Desktop.

## Rolling Updates

Create a Deployment having 2 Replicas and a RollingUpdate strategy.

First, update, build, tag and push the image:
```
$ docker build -t deanorogers/account-sapi .
$ docker run -p 8090:8090 deanorogers/account-sapi
$ docker stop CONTAINER_ID
$ docker tag 5793f9147f37 deanorogers/account-sapi:1.0
$ docker push deanorogers/account-sapi:1.0  
```
Second, update deploy.yml to refer to the latest tagged image in Docker Hub:
```
image: deanorogers/account-sapi:1.0
```
And deploy using k8s RollingUpdate:
```
$ kubectl apply -f deploy.yml
-- monitor the progress of the RollingUpdate
$ kubectl get pods --watch
$ kubectl rollout status deployments/account-sapi-deploy 
```

Other useful Kubectl commands

```
$ kubectl get deployments
-- gracefully roll all pods
$ kubectl rollout restart deployment [deployment name]
-- example container logs
$ kubectl get pods
$ kubectl logs account-sapi-deploy-946d494dc-2c4hj
```

# References
Pluralsight - Getting Started with Kubernetes - Nigel Poulton