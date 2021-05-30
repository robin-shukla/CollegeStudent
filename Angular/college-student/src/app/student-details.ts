export class StudentDetails {
    studentid: number;
    studentname: string;
    studentcollegename: string;
    studentroolno: string;
    studentphoneno: string;
    studentemailid: string;
    studentaddress: string;

    constructor(studentid: number, studentname: string, studentcollegename: string, studentroolno: string, studentphoneno: string, studentemailid: string, studentaddress: string){
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentcollegename = studentcollegename;
        this.studentroolno =  studentroolno;
        this.studentphoneno = studentphoneno;
        this.studentemailid = studentemailid;
        this.studentaddress = studentaddress;
    }
}
