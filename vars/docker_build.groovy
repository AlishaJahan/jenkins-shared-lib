def buildImage(String imageName, String tag = 'latest') {
    sh "docker build -t ${imageName}:${tag} ."
}
