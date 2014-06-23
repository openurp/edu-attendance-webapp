package org.openurp.webapp.apps.teach.attendance.college.action

import org.beangle.struts2.action.EntityDrivenAction
import org.openurp.webapp.apps.teach.attendance.AttendanceAction
import org.openurp.webapp.apps.teach.attendance.model.Form

class AdminclassAction extends CollegeAction {

  override protected def findItem(form: Form) = attendanceService findAdminclassItem form

  
  override def populateForm(): Form = {
    val form = super.populateForm
    form.departmentId = 24
    form
  }
}