package com.example.Hospital.Management.System.entity;

public class Job {
    private static String job;

    private static String jobTitle;

    public Job(Builder builder) {
        this.jobTitle= Builder.jobTitle;

    }


    public static String getJobTitle() {
        return jobTitle;
    }


    @Override
    public String toString() {
        return "Job{}";
    }

    public static class Builder{

       private static String jobTitle;

       public Builder setjobTitle(String jobTitle){

          this.jobTitle=jobTitle;
          return this;

       }
      public Builder copy (Job job){

           this.jobTitle= Job.jobTitle;
           return this;

      }
       public Job build() {

           return new Job(this);


       }

   }



}
