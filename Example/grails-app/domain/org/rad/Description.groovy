package org.rad

import org.apache.tools.ant.types.resources.comparators.Size;

class Description {

	String comment
	Title title
	Summary summary
	
	static constraints = {    
			title blank: false, nullable: false,validator:{ value , object -> 
             //get title object from database,based on your logic/requirement  
                 def title =  Title
             // get summary object from database,based on your logic/requirement 
                 def summary =  Summary          
                if (title.getLanguage().equals(summary.getLanguage())){
                     println "same language"          
                     return true
                } else {
                       //show message for validation failed.
                    return ['not.unique.validation','Langauge']
                }
            }
	}
	
	String toString(){return title}
}
