sudo yum install -y yum-utils
sudo yum-config-manager     --add-repo 
sudo yum-config-manager     --add-repo     https://download.docker.com/linux/centos/docker-ce.repo
sudo yum install docker-ce docker-ce-cli containerd.io docker-compose-plugin
sudo systemctl start docker
sudo docker run hello-world
sudo systemctl enable docker
sudo usermod -aG docker jenkins
logout
docker ps
docker-compose
sudo chmod +x /usr/local/bin/docker-compose
sudo curl -L "https://github.com/docker/compose/releases/download/1.24.1/docker-compose-$(uname -s)-$(uname -m)" -o /usr/local/bin/docker-compose
sudo chmod +x /usr/local/bin/docker-compose
docker-compose
docker pull jenkins/jenkins:lts
ll
[jenkins@localhost ~]$ ll
mkdir jenkins
ls
pwd
mv jenkins/ jenkins-data
ls
pwd
cd jenkins-data
vi docker-compose.yml
mkdir jenkins_home
vi docker-compose.yml
ls
vi docker-compose.yml
cat docker-compose.yml
id
sudo chown 1000:1000 jenkins_home -R
docker-compose up -d
docker ps
docker log -f jenkins
docker log f jenkins
docker logs -f jenkins
exit
ls
cd jenkins-data/
ls
cd jenkins_home
ls
pwd
cd /var/run/
ls
cd /home/jenkins/jenkins-data/jenkins_home
ls
cd .
cd ..
ls
vi docker-compose.yml
ls
mkdir pipeline
cd pipeline/
ls
vi Dockerfile
ls
vi Dockerfile
ls
cd ..
ls
vi docker-compose.yml 
docker-compose build
vi docker-compose.yml 
ls
cd pipeline/
ls
vi Dockerfile
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd p
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
/bin/sh: 1: sudo: not found
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
cd ..
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
cd pipeline/
vi Dockerfile 
cd ..
docker-compose build
logout
ip a
docker ps
sudo docker ps
echo "Ola"
ls
cd jenkins-data/
ls
vi docker-compose.yml
ls
docker-compose build
ls
cd pipeline/
ls
vi Dockerfile 
cd ..
vi docker-compose.yml 
docker exec -ti jenkins bash
sudo chown 1000:1000 /var/run/docker.sock
docker exec -ti jenkins bash
ls
cd jenkins-data/
ls
vi docker-compose.yml 
docker-compose up -d
docker stop gitlab-server
ip a
docker ps
exit
docker ps
docker images
docker ps
docker images
docker rmi c2e813689abe
docker rmi 616d2581d755
docker rmi 97864d10fc50
docker rm 1dcd60afd660
docker rmi 97864d10fc50
docker rmi 3939cef7d1bf
docker rm c612599a879f
docker rmi 3939cef7d1bf
docker rm 04ed587f14aa
docker rmi 3939cef7d1bf
docker images
docker rmi 947086e9d1db
docker rm aef848e12634
docker images
docker rm aef848e12634
docker rmi 947086e9d1db
docker rmi 106f27eb2d2c
docker rm 1b3d109129d5
docker rmi 106f27eb2d2c
docker rm 5e5ff3cd4a82
docker rmi 106f27eb2d2c
docker rm 9c22b6ced971
docker rmi 106f27eb2d2c
docker images
docker rmi 613068651a51
docker rm 6616642806b2
docker rmi 613068651a51
docker rm 2b6f308f9afc
docker rmi 613068651a51
docker rm d984590884c7
docker rmi 613068651a51
docker rmi f0a2ba153aab
docker rm f0a2ba153aab
docker images
docker rmi 613068651a51
docker images
docker rmi 24c3472a1690
docker rm 40c912f0feda
docker rmi 24c3472a1690
docker rm 4817a4201abe
docker images
docker rmi 24c3472a1690
docker images
docker rmi 0c091266b46f
docker rm 802dc688ac7c
docker rmi 0c091266b46f
docker images
docker rmi 1c0216cec850
docker rm fb716a3ab1ed
docker rmi 1c0216cec850
docker rm ddee196672df
docker images
docker rmi 1c0216cec850
docker images
docker rmi a5049a66d8d2
docker rm 2866e29e56b5
docker images
quit
shutdown
sudo shutdown
docker ps
docker log -f gitlab-server
docker logs -f gitlab-server
docker images
docker stop gitlab-server
docker images
docker rmi gitlabgitlab-ee
docker images
ip a
quit
shutdown
sudo shutdown
ls
cd jenkins-data/
ls
docker-composer up -d
docker-compose up -d
docker logs -f gitlab-server
ip a
ping www.google.com
ls
docker login
ip a
