export class College {
    collegeid: number;
    collegename: string;
    collegeaddress: string;
    collegepincode: string;
    collegephoneno: string;
    collegeemail: string;

    constructor(collegeid: number, collegename: string, collegeaddress: string, collegepincode: string, collegephoneno: string, collegeemail: string){
        this.collegeid = collegeid;
        this.collegename = collegename;
        this.collegeaddress = collegeaddress;
        this.collegepincode =  collegepincode;
        this.collegephoneno = collegephoneno;
        this.collegeemail = collegeemail;
    }

}
