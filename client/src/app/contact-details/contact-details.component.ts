import { Contact } from './../contact';
import { Component, OnInit, Input } from '@angular/core';
import { ContactService } from '../contact.service';
import { ContactListComponent } from '../contact-list/contact-list.component';

@Component({
  selector: 'app-contact-details',
  templateUrl: './contact-details.component.html',
  styleUrls: ['./contact-details.component.css']
})
export class ContactDetailsComponent implements OnInit {

  @Input() contact: Contact;

  constructor(private contactService: ContactService, private listComponent: ContactListComponent) { }

  ngOnInit() {
  }

}
