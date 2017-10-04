# Algorithms
This Repository contains all sort of algrithms that we learn for Algorithms. 

## How to Contribute ##
1. First, fork this repository to your account.

2. Clone this repository (this would make rebasing easier).
    ```
    git clone https://github.com/yasirunilan/Algorithms.git
    ```
3. Add a remote to your forked repository. This remote will be needed to push your changes to your repo.
    ```
    git remote add myfork https://github.com/<username>/Algorithms.git
    ```
4. Find an issue in this repository that you would like to and can fix.
   After you have found an issue, ping a maintainer on that issue to assigned it to you.
   
   Once the issue is assigned to you, you can start working on it. Step 6 and beyond will guide you through this part of contribution.
   
   **Only PR from the assignee would be considered. This is to save yours and ours time and energy.**
   
5. Create a new branch and switch to it. (make sure you are on master before doing this).
    ```
    git branch mybranch
    git checkout mybranch
    ```
    'mybranch' can be replaced by your preferred name for the branch.
    The above to commands are equivalent to the following
    ```
    git checkout -b mybranch
    ```

6. Make your changes.
   ##### Before you contribute, please see [CONTRIBUTION GUIDE](https://github.com/yasirunilan/Algorithms/blob/master/CONTRIBUTING.md)
 
7. Then stage them and commit them.

    *A small description of your changes is must in the commit messages.* 

8. After you are done making changes, push the branch to your fork.
    ```
    git push -u myfork mybranch
    ```
    The **-u** option is required only the first time you push the branch.
	In case you have made multiple commits, you need to squash them into a single commit before pushing.

9. Then create a PR from that branch using GitHub.
  *Add the issue number that you are addressing through your pull request along with describing what you did for the PR description.It will be eaasy to manage issues and PR's*
  
  Following format is good
  ```
  What you did
  resolves #issue_number
  ```

**What after you have submitted a PR?**

Well, you could wait for it to be reviewed by someone or you could attempt to fix another issue. 



