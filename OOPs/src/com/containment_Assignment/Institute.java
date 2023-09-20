package com.containment_Assignment;

class Institute {

	public int iId;
	public String iName;
	Branch branch;

	Institute() {

	}

	Institute(int iId, String iName, Branch branch) {
		this.iId = iId;
		this.iName = iName;
		this.branch = branch;

	}

	public void setBranch(Branch b) {
		this.branch = b;
	}

	public void showInstitute() {
		System.out.println("Institute id: " + iId);
		System.out.println("Institute Name: " + iName);
		branch.showBranch();
	}

}
