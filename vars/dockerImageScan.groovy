// def call(String project, String ImageTag, String hubUser){
    
//     sh """   
//      trivy image ${hubUser}/${project}:latest > scan.txt
//      cat scan.txt
//     """
// }

def call(String awsAccoutId,String region, String ecrRepoName){
    sh """   
     trivy image ${awsAccoutId}.dkr.ecr.${region}.amazonaws.com/${ecrRepoName}:latest > scan.txt
     cat scan.txt
    """
}