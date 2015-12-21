package io.shinto.amaterasu.dsl

import java.io.File

import org.eclipse.jgit.api.Git

/**
  * The GitUtil class handles getting the job git repository
  */
object GitUtil {

  def cloneRepo(repoAddress: String, branch: String) = {

    //TODO: add authentication
    Git.cloneRepository
      .setURI(repoAddress)
      .setDirectory(new File("repo"))
      .setBranch(branch)
      .call

  }

}
