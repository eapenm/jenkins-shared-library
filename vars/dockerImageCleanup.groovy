// def call(String project, String ImageTag, String hubUser){
    
//     sh """
//      docker rmi ${hubUser}/${project}:${ImageTag}
//      docker rmi ${hubUser}/${project}:latest
//     """
// }


def call(String awsAccoutId,String region, String ecrRepoName){
    
    sh """
     docker rmi ${ecrRepoName}:latest ${awsAccoutId}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
}
