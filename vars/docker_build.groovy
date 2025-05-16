def call(Map config = [:]) {
    def imageName   = config.get('imageName') ?: error("Image name is required")
    def imageTag    = config.get('imageTag', 'latest')
    def dockerfile  = config.get('dockerfile', 'Dockerfile')
    def buildContext = config.get('context', '.')

    echo "Building Docker image '${imageName}:${imageTag}' using Dockerfile: ${dockerfile}"

    sh """
        docker build \\
            -t ${imageName}:${imageTag} \\
            -t ${imageName}:latest \\
            -f ${dockerfile} \\
            ${buildContext}
    """
}
