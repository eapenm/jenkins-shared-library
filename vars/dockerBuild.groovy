// def call(String project,String tag, String hubUser){
//     sh """
//       docker image build -t ${hubUser}/${project} .
//       docker image tag ${hubUser}/${project} ${hubUser}/${project}:${tag}
//       docker image tag ${hubUser}/${project} ${hubUser}/${project}:latest
//     """
// }

def call(String awsAccoutId,String region, String ecrRepoName){
    sh """
      docker build -t ${ecrRepoName} .
      docker tag ${ecrRepoName}:latest ${awsAccoutId}.dkr.${region}.amazonaws.com/${ecrRepoName}:latest
    """
}