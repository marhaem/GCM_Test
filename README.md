## Welcome to my GitHub-repository!
this is my first private project with GitHub

# GCM_Test
I'm just trying to get **Google Cloud Messaging** to work, to send messages (eg. logs from my server) to my android device.
Also I want to learn how to use **GitHub** properly.

Feel free to contact me, contribution or help or just showing interest is always appreciated.
I am not yet an expert of anything at all.

### How to create a local git repository from an existing project and push it to an empty remote repository

start git bash in the directory where your project is located in
````bash
git init
````

add the files to the local repository
````bash
git add .
````

Now the files can be committed locally
````bash
git commit -m "First commit"
````

To upload the committed files, do the following:
but first you need to get the url of the remote repository, this can be done by opening git in your browser and opening the repositories Quick Edit site. The URL can be copied from there
````bash
git remote add origin <your-remote-repositories_url>
````

you just assigned a remote repository to your alias 'origin'
next thing to do is to verify this
````bash
git remote -v
````

this should output something like this:
````bash
origin  https://github.com/marhaem/GCM_Test.git (fetch)
origin  https://github.com/marhaem/GCM_Test.git (push)
````

OK, there's some more to do!
Push the local repository by doing the following, but be sure there isn't already an existing master branch.
````bash
git push origin master
````

Now that should be it, if you check your repository you can see the files being added.

### Renaming a branch

````bash
git branch -m <oldname> <newname>
````

### clone an existing remote repository to a local machine
````bash
git clone <your-remote-repository_url>
````
@TODO: how to change files and then upload changes
